package learn.advanced.javajdbc.repository;

import learn.advanced.javajdbc.config.JdbcConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao<T> {

    protected abstract String getInsertQuery();
    protected abstract void setInsertParameters(PreparedStatement statement, T object) throws SQLException;

    protected abstract String getUpdateQuery();
    protected abstract void setUpdateParameters(PreparedStatement statement, T object) throws SQLException;

    protected abstract String getGetQuery();
    protected abstract void setGetParameters(PreparedStatement statement, Object id) throws SQLException;
    protected abstract T createObjectFromResultSet(ResultSet resultSet) throws SQLException;

    protected abstract String getDeleteQuery();
    protected abstract void setDeleteParameters(PreparedStatement statement, Object id) throws SQLException;

    protected abstract String getGetAllQuery();


    public List<T> findAll() {
        List<T> resultList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = JdbcConfig.connection();
            statement = connection.prepareStatement(getGetAllQuery());
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                T object = createObjectFromResultSet(resultSet);
                resultList.add(object);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(resultSet, statement, connection);
        }

        return resultList;
    }

    public void insert(T object) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JdbcConfig.connection();
            statement = connection.prepareStatement(getInsertQuery());
            setInsertParameters(statement, object);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Insertion successful.");
            } else {
                System.out.println("Insertion failed.");
            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public void update(T object) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JdbcConfig.connection();
            statement = connection.prepareStatement(getUpdateQuery());
            setUpdateParameters(statement, object);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Insertion successful.");
            } else {
                System.out.println("Insertion failed.");
            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }
    }

    public T get(Object id) {

        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JdbcConfig.connection();
            statement = connection.prepareStatement(getGetQuery());
            setGetParameters(statement, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return createObjectFromResultSet(resultSet);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }

        return null;
    }

    public void delete(Object id) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = JdbcConfig.connection();
            statement = connection.prepareStatement(getDeleteQuery());
            setDeleteParameters(statement, id);
            statement.executeQuery();


        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(statement, connection);
        }

    }

    private void closeResources(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            if (resource != null) {
                try {
                    resource.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
