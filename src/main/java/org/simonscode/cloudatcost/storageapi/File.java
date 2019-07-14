package org.simonscode.cloudatcost.storageapi;

import lombok.Data;

@Data
public class File {
    private long id;
    private String fileName;
    private long dateUploaded;
    private String ip;
    private long downloads;
    private String password;
    private boolean isProtected;
    private long daysExpiration;
    private long downloadsExpiration;
    private String URL;
}
