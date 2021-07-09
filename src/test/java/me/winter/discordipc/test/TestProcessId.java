package me.winter.discordipc.test;

import com.jagrosh.discordipc.IPCClient;
import org.junit.jupiter.api.Test;

/**
 * Tests the retrieval of PIDs
 * <p>
 * Created on 2021-07-09.
 *
 * @author Alexander Winter
 */
public class TestProcessId
{
	@Test
	public void testPID()
	{
		System.out.println(IPCClient.getPID());
	}
}
