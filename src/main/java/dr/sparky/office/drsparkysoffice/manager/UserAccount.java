package dr.sparky.office.drsparkysoffice.manager;

public class UserAccount {

    private String username;
    private String password;
    private String permissionLevel;

    // Constructor, getters, and setters
    public UserAccount(String username, String password, String permissionLevel) {
        this.username = username;
        this.password = password;
        this.permissionLevel = permissionLevel;
    }

    public boolean authenticateUser(String username, String password) {
        // Add authentication logic here (this is a placeholder for real authentication logic)
        return this.username.equals(username) && this.password.equals(password);
    }

    public void setPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
        }
        // Else, handle the error case where the old password does not match
    }

    public void setPermissions(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    // Standard getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

}
