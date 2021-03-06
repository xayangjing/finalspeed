// Copyright (c) 2015 D1SM.net

package net.fs.rudp;

public class ResendItem {

    private int count;

    ConnectionUDP conn;

    int sequence;

    private long resendTime;

    ResendItem(ConnectionUDP conn, int sequence) {
        this.conn = conn;
        this.sequence = sequence;
    }

    void addCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ConnectionUDP getConn() {
        return conn;
    }

    public void setConn(ConnectionUDP conn) {
        this.conn = conn;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public long getResendTime() {
        return resendTime;
    }

    public void setResendTime(long resendTime) {
        this.resendTime = resendTime;
    }

}
