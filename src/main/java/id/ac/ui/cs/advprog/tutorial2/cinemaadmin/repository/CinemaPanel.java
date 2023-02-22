package id.ac.ui.cs.advprog.tutorial2.cinemaadmin.repository;

import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.Command;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CinemaPanel {
    final private Map<String,Command> commands = new HashMap<>();
    private List<String> commandHistory = new ArrayList<>();

    public void execute(String commandName) {
        // TODO : DONE
        // Mendapatkan command dari HashMap lalu execute dan tambah ke history
        Command command = commands.get(commandName);
        String message = command.execute();
        commandHistory.add(message);
    }

    public void addCommand(Command command) {
        // TODO : DONE
        // Mendapatkan namaCommand lalu memasangkan ke Hashmap
        String namaCommand = command.getCommandName();
        commands.put(namaCommand, command);
    }

    public void clearCommand() {
        commands.clear();
    }

    public List<String> getCommandHistory() {
        return commandHistory;
    }
}
