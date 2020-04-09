package ch.course223.springadvanced.domainModels.user;

import java.util.List;

public interface UserService {
    public User getBestEarningUser();
    public User getWorstEarningUser();
    public List<User> allUsersWithEvenEarnings();
    public List<User> allUsersWithOddEarnings();
    public List<User> allUsersEarningMoreThan(int x);
    public List<User> allUsersEarningLessThan(int x);
    public List<User> allUsersEarningBetween(int x, int y);
}
