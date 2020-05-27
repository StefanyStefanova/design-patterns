public abstract class Factory {
    protected UserFactory userFactory;

    public User makeUser(ChatMediator m, String name)
    {
        return userFactory.makeUser(m,name);
    }
}
