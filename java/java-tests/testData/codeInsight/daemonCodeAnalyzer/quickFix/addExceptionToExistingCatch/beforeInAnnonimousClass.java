// "Add exception to existing catch clause" "true"
import java.io.FileInputStream;

class Test {
  void m() {
    try {
      new Runnable() {
        @Override
        public void run() { }

        InputStream in = new <caret>FileInputStream("");
      };
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
}