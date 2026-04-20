package umapravalika;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class assignement2

{
	// ---( internal utility methods )---

	final static assignement2 _instance = new assignement2();

	static assignement2 _newInstance() { return new assignement2(); }

	static assignement2 _cast(Object o) { return (assignement2)o; }

	// ---( server methods )---




	public static final void power (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(power)>> ---
		// @sigtype java 3.5
		// [i] field:0:required base
		// [i] field:0:required exponent
		// [o] field:0:required result
		// 1. Create a cursor to navigate the pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		try {
		    // 2. Read the input strings from the pipeline
		    String baseStr = IDataUtil.getString(pipelineCursor, "base");
		    String exponentStr = IDataUtil.getString(pipelineCursor, "exponent");
		
		    // 3. Convert Strings to Doubles for calculation
		    double base = Double.parseDouble(baseStr);
		    double exponent = Double.parseDouble(exponentStr);
		
		    // 4. Perform the power calculation using Java's Math library
		    double powerResult = Math.pow(base, exponent);
		
		    // 5. Place the result back into the pipeline as a String
		    IDataUtil.put(pipelineCursor, "result", String.valueOf(powerResult));
		    
		} catch (Exception e) {
		    // 6. Handle errors (like non-numeric input)
		    throw new ServiceException(e);
		} finally {
		    // 7. Always destroy the cursor to prevent memory leaks
		    pipelineCursor.destroy();
		}
			
		// --- <<IS-END>> ---

                
	}
}

