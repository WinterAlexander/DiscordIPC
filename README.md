# DiscordIPC

[![](https://jitpack.io/v/WinterAlexander/DiscordIPC.svg)](https://jitpack.io/#WinterAlexander/DiscordIPC)

Connect locally to the Discord client using IPC for a subset of RPC features like Rich Presence and Activity Join/Spectate


# Features

- Setting Rich Presence
- Listen for Join, Spectate, and Join-Request events
- Detect and specify priority for client build (Stable, PTB, Canary)
- 100% Java


# Getting Started

To use this fork, follow the instructions in [JitPack.io](https://jitpack.io/#WinterAlexander/DiscordIPC/1.1.1). 
You may also use the [upstream version](https://github.com/jagrosh/DiscordIPC) which may work for you. For me it did not work due to the way it attemps to get the PID of the process. This fork only fixes that.

# Example

Quick example, assuming you already have a GUI application
```java
IPCClient client = new IPCClient(345229890980937739L);
client.setListener(new IPCListener(){
    @Override
    public void onReady(IPCClient client)
    {
        RichPresence.Builder builder = new RichPresence.Builder();
        builder.setState("West of House")
            .setDetails("Frustration level: Over 9000")
            .setStartTimestamp(OffsetDateTime.now())
            .setLargeImage("canary-large", "Discord Canary")
            .setSmallImage("ptb-small", "Discord PTB")
            .setParty("party1234", 1, 6)
            .setMatchSecret("xyzzy")
            .setJoinSecret("join")
            .setSpectateSecret("look");
        client.sendRichPresence(builder.build());
    }
});
client.connect();
```

### Other Examples
* [Monster Hunter Gathering Hall App](https://github.com/MHGatheringHall/App) - App for displaying in-game info for a non-PC game series


# Official Discord-RPC Bindings

The official RPC bindings can be found here: https://github.com/discordapp/discord-rpc

A Java wrapper for the official bindings is available here: https://github.com/MinnDevelopment/Java-DiscordRPC
