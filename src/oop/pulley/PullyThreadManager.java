package oop.pulley;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class PullyThreadManager {
    private static final int MAX_PULLY_COUNT = 5;
    private static final ExecutorService executorService = Executors.newFixedThreadPool(MAX_PULLY_COUNT);

    private final List<Pully> pullys;

    private PullyThreadManager(List<Pully> pullys) {
        // validateMaxPullyCount
        // validateDuplicateId
        this.pullys = pullys;
    }

    public Pully selectMostSuitablePully() {
        return pullys.get(0);
    }

    public void v() {
        // executorService.submit(selectMostSuitablePully());
    }
}