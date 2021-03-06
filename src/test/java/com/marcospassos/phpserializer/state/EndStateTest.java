package com.marcospassos.phpserializer.state;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author Marcos Passos
 * @since 1.0
 */
public class EndStateTest
{
    private FinishedState state = new FinishedState();

    @Test
    public void isReferableReturnsFalse() throws Exception
    {
        assertFalse(state.isReferable());
    }

    @Test(expected = IllegalStateException.class)
    public void valueIsNotAllowed() throws Exception
    {
        state.value();
    }

    @Test(expected = IllegalStateException.class)
    public void objectBeginIsNotAllowed() throws Exception
    {
        state.objectBegin();
    }

    @Test(expected = IllegalStateException.class)
    public void objectEndIsNotAllowed() throws Exception
    {
        state.objectEnd();
    }

    @Test(expected = IllegalStateException.class)
    public void serializableObjectBeginIsNotAllowed() throws Exception
    {
        state.serializableBegin();
    }

    @Test(expected = IllegalStateException.class)
    public void serializableObjectEndIsNotAllowed() throws Exception
    {
        state.serializableEnd();
    }

    @Test(expected = IllegalStateException.class)
    public void propertyIsNotAllowed() throws Exception
    {
        state.property();
    }

    @Test(expected = IllegalStateException.class)
    public void arrayBeginIsNotAllowed() throws Exception
    {
        state.arrayBegin();
    }

    @Test(expected = IllegalStateException.class)
    public void arrayEndIsNotAllowed() throws Exception
    {
        state.arrayEnd();
    }

    @Test(expected = IllegalStateException.class)
    public void keyIsNotAllowed() throws Exception
    {
        state.key();
    }
}