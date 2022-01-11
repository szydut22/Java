public abstract class Network {
    private String userName;
    private String password;

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    abstract boolean logIn(String userName, String password);
    abstract void logOut();
    abstract void sendData(String data);

    public void post(String message) {

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
