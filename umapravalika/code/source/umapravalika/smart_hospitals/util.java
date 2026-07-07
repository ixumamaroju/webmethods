package umapravalika.smart_hospitals;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.util.*;
// --- <<IS-END-IMPORTS>> ---

public final class util

{
	// ---( internal utility methods )---

	final static util _instance = new util();

	static util _newInstance() { return new util(); }

	static util _cast(Object o) { return (util)o; }

	// ---( server methods )---




	public static final void buildNextDoctorId (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(buildNextDoctorId)>> ---
		// @sigtype java 3.5
		// [i] field:0:required currentDoctorId
		// [o] field:0:required doctorId
		IDataCursor cursor = pipeline.getCursor();
		
		String currentDoctorId = IDataUtil.getString(cursor, "currentDoctorId");
		
		String doctorId;
		
		if (currentDoctorId == null || currentDoctorId.trim().isEmpty()) {
		
		    doctorId = "D001";
		
		} else {
		
		    String numericPart = currentDoctorId.replaceAll("\\D+", "");
		
		    int nextNumber = Integer.parseInt(numericPart) + 1;
		
		    doctorId = String.format("D%03d", nextNumber);
		}
		
		IDataUtil.put(cursor, "doctorId", doctorId);
		
		cursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void buildNextPatientId (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(buildNextPatientId)>> ---
		// @sigtype java 3.5
		// [i] field:0:required currentPatientId
		// [o] field:0:required patientId
		IDataCursor cursor = pipeline.getCursor();
		
		String currentPatientId = IDataUtil.getString(cursor, "currentPatientId");
		
		String patientId;
		
		if (currentPatientId == null || currentPatientId.trim().isEmpty()) {
		    patientId = "P001";
		} else {
		    String numericPart = currentPatientId.replaceAll("\\D+", "");
		    int nextNumber = Integer.parseInt(numericPart) + 1;
		    patientId = String.format("P%03d", nextNumber);
		}
		
		IDataUtil.put(cursor, "patientId", patientId);
		
		cursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

