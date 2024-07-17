import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaJavaScriptIntegration {
    public static void main(String[] args) {
        // Create a script engine manager
        ScriptEngineManager manager = new ScriptEngineManager();
        
        // Create a JavaScript engine
        ScriptEngine engine = manager.getEngineByName("nashorn");
        
        // JavaScript code to execute
        String script = "var greeting = 'Hello, World!';"
                      + "var add = function(a, b) { return a + b; };"
                      + "greeting + ' The sum of 5 and 3 is ' + add(5, 3);";
        
        try {
            // Execute the script
            Object result = engine.eval(script);
            
            // Print the result
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
