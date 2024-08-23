package generics;

public class User implements Comparable<User>, Cloneable {
    private final int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }

    @Override
    public String toString(){
        return String.valueOf(points);
    }
}
