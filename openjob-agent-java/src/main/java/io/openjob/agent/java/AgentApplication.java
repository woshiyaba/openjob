package io.openjob.agent.java;

import io.openjob.agent.java.command.AgentCommand;
import picocli.CommandLine;

/**
 * @Author cyj
 * @Date 2023/8/27 21:15
 * @PackageName:io.openjob.agent.java
 * @ClassName: AgentApplication
 */
public class AgentApplication {
    public static void main(String[] args) {
        new CommandLine(new AgentCommand()).execute(args);
    }
}
