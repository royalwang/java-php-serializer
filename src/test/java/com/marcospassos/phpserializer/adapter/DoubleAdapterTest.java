package com.marcospassos.phpserializer.adapter;

import com.marcospassos.phpserializer.Context;
import com.marcospassos.phpserializer.Writer;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * @author Marcos Passos
 * @since 1.0
 */
public class DoubleAdapterTest
{
    @Test
    public void write() throws Exception
    {
        DoubleAdapter adapter = new DoubleAdapter();
        Writer writer = mock(Writer.class);
        Context context = mock(Context.class);

        adapter.write(1.5, writer, context);

        verify(writer).writeFloat(1.5);

        verifyNoMoreInteractions(writer);
    }
}