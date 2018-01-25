
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "control", eager = true)
public class UserController {

    private List<User> listUsers;

    public List<User> getListUsers() {
        addUser();
        return listUsers;
    }

    public void setListUsers(List<User> listUsers) {
        this.listUsers = listUsers;
    }

    public void addUser() {
        List<User> listUsers = new ArrayList();
        listUsers.add(new User(1, "Ramin", "Balanmadov"));
        listUsers.add(new User(2, "Hikmet", "Qafarzade"));
        listUsers.add(new User(3, "Fuad", "Memmedli"));
        listUsers.add(new User(4, "Natiq", "Memmedli"));
        this.listUsers = listUsers;
    }
}
