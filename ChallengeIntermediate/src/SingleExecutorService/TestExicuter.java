package SingleExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExicuter {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
          Printstar task = new Printstar();
          service.submit(task);
        }
    }
}
