package learn.advanced.javajdbc.repository;

import learn.advanced.javajdbc.model.Person;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRepository extends BaseDao<Person> {

    /**
     * @return string for insert query
     */
    @Override
    protected String getInsertQuery() {
        return "INSERT INTO person(id,first_name,last_name,email,address,age) VALUES (?,?,?,?,?,?)";
    }

    /**
     * @param statement prepared statement for save database
     * @param object person object for save to database
     * @throws SQLException
     */
    @Override
    protected void setInsertParameters(PreparedStatement statement, Person object) throws SQLException {
        statement.setString(1, object.getId());
        statement.setString(2, object.getFirstName());
        statement.setString(3, object.getLastName());
        statement.setString(4, object.getEmail());
        statement.setString(5, object.getAddress());
        statement.setInt(6, object.getAge());
    }

    /**
     * @return string query for update
     */
    @Override
    protected String getUpdateQuery() {
        return "UPDATE person set first_name=?, last_name=?, email=?,address=?, age=? where id=?";
    }

    @Override
    protected void setUpdateParameters(PreparedStatement statement, Person object) throws SQLException {
        statement.setString(1, object.getFirstName());
        statement.setString(2, object.getLastName());
        statement.setString(3, object.getEmail());
        statement.setString(4, object.getAddress());
        statement.setInt(5, object.getAge());
        statement.setString(6, object.getId());
    }

    @Override
    protected String getGetQuery() {
        return "SELECT id,first_name,last_name,email,address,age from person where id=?";
    }

    @Override
    protected void setGetParameters(PreparedStatement statement, Object id) throws SQLException {
        statement.setString(1, id.toString());
    }

    /**
     * @param resultSet Result from execute query
     * @return object person
     * @throws SQLException
     */
    @Override
    protected Person createObjectFromResultSet(ResultSet resultSet) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getString("id"));
        person.setFirstName(resultSet.getString("first_name"));
        person.setLastName(resultSet.getString("last_name"));
        person.setEmail(resultSet.getString("email"));
        person.setAddress(resultSet.getString("address"));
        person.setAge(resultSet.getInt("age"));

        return person;
    }

    /**
     * @return query for delete person by id
     */
    @Override
    protected String getDeleteQuery() {
        return "DELETE FROM person where id=?";
    }

    /**
     * @param statement add statement for delete
     * @param id param string id person
     * @throws SQLException
     */
    @Override
    protected void setDeleteParameters(PreparedStatement statement, Object id) throws SQLException {
        statement.setString(1, id.toString());
    }

    @Override
    protected String getGetAllQuery() {
        return "SELECT id,first_name,last_name,email,address,age FROM person";
    }
}
