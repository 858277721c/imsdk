package com.sd.lib.imsdk;

import com.sd.lib.imsdk.model.IMUser;

public class IMMessage
{
    String id;
    long timestamp;
    IMUser sender;

    String peer;
    IMConversationType conversationType;
    boolean isSelf;
    IMMessageState state;

    IMMessageItem item;

    IMMessage()
    {
    }

    public String getId()
    {
        return id;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public IMMessageState getState()
    {
        return state;
    }

    public IMUser getSender()
    {
        return sender;
    }

    public boolean isSelf()
    {
        return isSelf;
    }

    public String getPeer()
    {
        return peer;
    }

    public IMConversationType getConversationType()
    {
        return conversationType;
    }

    public IMMessageItem getItem()
    {
        return item;
    }

    PersistenceAccessor persistenceAccessor()
    {
        return new PersistenceAccessor();
    }

    InterceptAccessor interceptAccessor()
    {
        return new InterceptAccessor();
    }

    public final class InterceptAccessor
    {
        private InterceptAccessor()
        {
        }
    }


    public final class PersistenceAccessor
    {
        private PersistenceAccessor()
        {
        }

        public void setId(String id)
        {
            IMMessage.this.id = id;
        }

        public void setTimestamp(long timestamp)
        {
            IMMessage.this.timestamp = timestamp;
        }

        public void setSender(IMUser sender)
        {
            IMMessage.this.sender = sender;
        }

        public void setPeer(String peer)
        {
            IMMessage.this.peer = peer;
        }

        public void setConversationType(IMConversationType conversationType)
        {
            IMMessage.this.conversationType = conversationType;
        }

        public void setSelf(boolean self)
        {
            IMMessage.this.isSelf = self;
        }

        public void setState(IMMessageState state)
        {
            IMMessage.this.state = state;
        }

        public void setItem(IMMessageItem item)
        {
            IMMessage.this.item = item;
        }
    }
}
