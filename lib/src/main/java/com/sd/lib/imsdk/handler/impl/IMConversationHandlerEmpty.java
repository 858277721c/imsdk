package com.sd.lib.imsdk.handler.impl;

import com.sd.lib.imsdk.IMConversation;
import com.sd.lib.imsdk.IMMessage;
import com.sd.lib.imsdk.callback.IMCallback;
import com.sd.lib.imsdk.callback.IMValueCallback;
import com.sd.lib.imsdk.constant.IMCode;
import com.sd.lib.imsdk.handler.IMConversationHandler;

import java.util.List;

class IMConversationHandlerEmpty implements IMConversationHandler
{
    @Override
    public void saveConversation(IMConversation conversation) throws Exception
    {

    }

    @Override
    public void updateConversationExt(IMConversation conversation) throws Exception
    {

    }

    @Override
    public void removeConversation(IMConversation conversation) throws Exception
    {

    }

    @Override
    public void loadConversation(IMConversation conversation, IMConversation.Accessor accessor) throws Exception
    {

    }

    @Override
    public int loadUnreadCount(IMConversation conversation) throws Exception
    {
        return 0;
    }

    @Override
    public void setMessageRead(IMConversation conversation) throws Exception
    {

    }

    @Override
    public List<IMConversation> getAllConversation() throws Exception
    {
        return null;
    }

    @Override
    public void loadMessageBefore(IMConversation conversation, int count, IMMessage lastMessage, IMValueCallback<List<IMMessage>> callback) throws Exception
    {
        callback.onError(IMCode.ERROR_OTHER, "empty implementation");
    }

    @Override
    public void deleteConversationMessage(IMConversation conversation, IMCallback callback) throws Exception
    {
        callback.onError(IMCode.ERROR_OTHER, "empty implementation");
    }
}
