package mock.quickstart;

/**
 * Created by Acceml on 2016/10/18.
 */
public class ClassTested {
    private Collaborator listener;

    public void setListener(Collaborator listener) {
        this.listener = listener;
    }

    public String sayHello(String title) {
        return listener.documentAdded(title);
    }
}
