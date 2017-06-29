package com.marcospassos.phpserializer.adapter;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import com.marcospassos.phpserializer.Context;
import com.marcospassos.phpserializer.Writer;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.mockito.InOrder;

/**
 * @author Marcos Passos
 * @since 1.0
 */
public class ListAdapterTest
{
    @Test
    public void write() throws Exception
    {
        ListAdapter<String> adapter = new ListAdapter<>();
        Writer writer = mock(Writer.class);
        Context context = mock(Context.class);
        List<String> array = Arrays.asList("a", "b", "c");

        adapter.write(array, writer, context);

        InOrder order = inOrder(writer, context);

        order.verify(writer).writeArrayStart(3);
        order.verify(writer).writeKey(0);
        order.verify(context).write("a", writer);
        order.verify(writer).writeKey(1);
        order.verify(context).write("b", writer);
        order.verify(writer).writeKey(2);
        order.verify(context).write("c", writer);
        order.verify(writer).writeArrayEnd();
    }
}