/*
 * ClientRecord.java
 *
 * Created on 17 March 2004, 11:47
 */

package distrit.server;

/** Object representing a client connected to an Interactive Task Server.
 * Used in Multiple Server setup to represent the allocation between servers
 * and clients.
 * @author mmg20
 */
public class ClientRecord {
    
    protected Object uid;
    protected String name;
    protected Object realId;
    protected ServerRecord allocatedServer;
    
    /** Creates a new instance of ClientRecord
     * @param name A unique name for this client
     */
    public ClientRecord( Object uid, String name ) {
        this.uid = uid;
        this.name = name;
    }
    
    /** Get method for this client's unique name
     * @return This client's unique name
     */    
    public String getName() {
        return name;
    }
        
    /** Get method for the ID given to this client by its currently allocated
     * server.  This is the ID by which the server refers to this client and
     * may be equal to the ID another client is refered to by another server.
     * @return ID given to this client by its currently allocated
     * server
     */    
    public Object getRealId() {
        return realId;
    }
    
    /** Set method for the ID given to this client by its currently allocated
     * server.  This is the ID by which the server refers to this client and
     * may be equal to the ID another client is refered to by another server.
     * @param realId ID by which the currently allocated server refers to this client
     */    
    public void setRealId( Object realId )
    {
        this.realId = realId;
    }
    
    /** Get method for the currently allocated server, ie. the server which
     * this client is servicing.  This is the server whose InteractiveTask
     * returned by the getTask( ) method this client is running.
     * @return ServerRecord object representing the server currently
     * allocated to this client
     */    
    public ServerRecord getAllocatedServer() {
        return allocatedServer;
    }
    
    /** Set method for the currently allocated server, ie. the server which
     * this client is servicing.  This is the server whose InteractiveTask
     * returned by the getTask( ) method this client is running.
     * @param allocatedServer The ServerRecord object of the server this client is now allocated to
     */    
    public void setAllocatedServer(ServerRecord allocatedServer ) {
        this.allocatedServer = allocatedServer;
    }
    
    /**
     */    
    public String toString()
    {
        return "[ " + uid + ", " + name + " ]";
    }
}
