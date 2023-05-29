package learn.advanced.javajdbc.dto;

/**
 * @param firstName
 * @param lastName
 * @param email
 * @param address
 * @param age
 */
public record PersonRequest(String firstName, String lastName, String email, String address, int age) {
}
