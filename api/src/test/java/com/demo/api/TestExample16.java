// File: src/test/java/com/demo/api/TestExample16.java

import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class TestExample16 {

  @Test public void example16() {
try {
    Thread.sleep(4000);
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}

	Assert.assertEquals("Testing with Gradle is easy", "Testing with Gradle is easy");
  }
}
