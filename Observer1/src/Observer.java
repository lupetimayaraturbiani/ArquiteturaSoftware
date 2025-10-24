import java.util.List;

public interface Observer {

    void update(String turmaNome, List<BoletimEntry> boletim);
}
