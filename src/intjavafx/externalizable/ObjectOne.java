/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewtest.externalizable;

import interviewtest.serializable.*;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 *
 * @author sandeep
 */
public class ObjectOne implements Externalizable {

    int employeeId = 123;
    String employeeName = "name";
    

    public ObjectOne() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

   

    @Override
    public void readExternal(ObjectInput in) throws IOException,
            ClassNotFoundException {
        employeeId = in.readInt();
        employeeName = (String) in.readObject();

    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(employeeId);
        out.writeObject(employeeName);
    }
}
