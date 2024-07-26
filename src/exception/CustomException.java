package exception;

public class CustomException extends Exception {

    String msg;

    public CustomException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
/*
try (ResourceType resource1 = new ResourceType(); ResourceType resource2 = new ResourceType()) {
    // Code that uses the resources
} catch (ExceptionType e) {
    // Exception handling
}
Here, ResourceType is a class that implements the AutoCloseable
or Closeable interface.
When the try block is exited, either normally or due to an exception,
the close() method of each resource is automatically called.
This eliminates the need for explicit finally blocks to
close resources and makes the code cleaner and less error-prone.
 */