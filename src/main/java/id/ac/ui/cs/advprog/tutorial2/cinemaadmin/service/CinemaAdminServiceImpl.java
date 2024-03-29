package id.ac.ui.cs.advprog.tutorial2.cinemaadmin.service;

import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.ac.ACHighCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.ac.ACLowCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.ac.ACMediumCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.ac.ACOffCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.lamp.LampOffCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.lamp.LampOnCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.screen.ScreenAdsCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.screen.ScreenFilmCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.command.screen.ScreenOffCommand;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.device.ac.AC;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.device.lamp.Lamp;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.device.screen.Screen;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.helper.Devices;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.core.helper.FormDevices;
import id.ac.ui.cs.advprog.tutorial2.cinemaadmin.repository.CinemaPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CinemaAdminServiceImpl implements CinemaAdminService {
    @Autowired
    private CinemaPanel cinemaPanel;

    private Devices devices = new Devices(new AC("AC"), new Lamp("Lamp"), new Screen("Screen"));

    @Override
    public Devices getDevices() {
        return devices;
    }

    @Override
    public void setDevices(FormDevices form) {
        devices.getAc().setEnable(form.getAc());
        devices.getLamp().setEnable(form.getLamp());
        devices.getScreen().setEnable(form.getScreen());
    }

    @Override
    public void registryCommand(Devices devices) {
        cinemaPanel.clearCommand();

        if (devices.getAc().getEnable()) {
            registryACCommand(devices.getAc());
        }
        if (devices.getLamp().getEnable()) {
            registryLampCommand(devices.getLamp());
        }

        if (devices.getScreen().getEnable()) {
            registryScreenCommand(devices.getScreen());
        }
    }

    public void registryACCommand(AC ac) {
        // TODO : DONE
        // Implement register for AC Command
        ACHighCommand acHighCommand = new ACHighCommand(ac);
        ACLowCommand acLowCommand = new ACLowCommand(ac);
        ACMediumCommand acMediumCommand = new ACMediumCommand(ac);
        ACOffCommand acOffCommand = new ACOffCommand(ac);
        cinemaPanel.addCommand(acHighCommand);
        cinemaPanel.addCommand(acLowCommand);
        cinemaPanel.addCommand(acMediumCommand);
        cinemaPanel.addCommand(acOffCommand);
    }

    public void registryLampCommand(Lamp lamp) {
        // TODO : DONE
        // Implement register for Lamp Command
        LampOffCommand lampOffCommand = new LampOffCommand(lamp);
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        cinemaPanel.addCommand(lampOffCommand);
        cinemaPanel.addCommand(lampOnCommand);
    }

    public void registryScreenCommand(Screen screen) {
        // TODO : DONE
        // Implement register for Screen Command
        ScreenAdsCommand screenAdsCommand = new ScreenAdsCommand(screen);
        ScreenFilmCommand screenFilmCommand = new ScreenFilmCommand(screen);
        ScreenOffCommand screenOffCommand = new ScreenOffCommand(screen);
        cinemaPanel.addCommand(screenAdsCommand);
        cinemaPanel.addCommand(screenFilmCommand);
        cinemaPanel.addCommand(screenOffCommand);
    }

    @Override
    public void executeCommand(String command) {
        // TODO : DONE
        // Digunakan untuk mengeksekusi command
        cinemaPanel.execute(command);

    }

    @Override
    public List<String> getHistory() {
        return cinemaPanel.getCommandHistory();
    }
}
