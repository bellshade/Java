package learn.advanced.javajdbc.dto;

/**
 * @param id
 * @param firstName
 * @param lastName
 * @param email
 * @param address
 * @param age
 */
public record PersonResponse(String id,String firstName, String lastName, String email, String address, int age) {
}
