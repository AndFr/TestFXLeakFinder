package com.andfr;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import java.util.Calendar;
import java.util.function.Function;

public class MainAppTest extends ApplicationTest {

    @Override
    public void start(Stage stage) {
        AppHBox appHBox = new AppHBox();
        Scene scene = new Scene(appHBox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
    @RepeatedTest(100)
    @Test
    public void should_contain_button() {
        // expect:
        write("H");
        showRamUsage();
    }

    public void showRamUsage() {
        //System.gc();
        Runtime rt = Runtime.getRuntime();
        long total = rt.totalMemory();
        long free = rt.freeMemory();
        Function<Long, String> toMB = x -> String.valueOf(x / 1024 / 1024);
        Calendar.getInstance().getTime();
        System.err.println(String.format("Memory Total: %sMB, Used: %sMB, Free: %sM, Time:%s", toMB.apply(total),
                toMB.apply(total - free), toMB.apply(free), Calendar.getInstance().getTime()));
    }
}