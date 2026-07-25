package midpoint.core.manager;

public interface Manager {

    void initialize();

    default void shutdown() {

    }
}
