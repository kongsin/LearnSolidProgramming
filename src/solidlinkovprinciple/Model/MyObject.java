/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidlinkovprinciple.Model;

import solidlinkovprinciple.Entities.ObjectPosition;
import solidlinkovprinciple.Interface.IDuckIO;
import solidlinkovprinciple.Model.map.Map;

/**
 *
 * @author kongsin
 */
public class MyObject implements IDuckIO {

    private ObjectPosition objectPosition;
    private String objectName;
    private String objectId;
    private final Map map;

    public MyObject(String ObjectId, String ObjectName, int startX, int startY, Map map) {
        this.objectId = ObjectId;
        this.objectName = ObjectName;
        this.objectPosition = new ObjectPosition();
        this.objectPosition.x = startX;
        this.objectPosition.y = startY;
        this.map = map;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectPosition(ObjectPosition duckPosition) {
        this.objectPosition = duckPosition;
    }

    public ObjectPosition getObjectPosition() {
        return objectPosition;
    }

    @Override
    public void displayObject() {
        this.map.displayMap(this);
    }
}
