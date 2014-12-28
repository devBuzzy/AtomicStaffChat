 package com.Minecoder101.staffchat;
 
 import java.util.LinkedList;
 import java.util.UUID;
 import net.md_5.bungee.api.connection.ProxiedPlayer;
 
 
 public class PlayerManager
 {
   public PlayerManager() {}
   
   private static volatile LinkedList<UUID> players = new LinkedList();
   
   public static void addPlayer(ProxiedPlayer player) { addPlayer(player.getUniqueId()); }
   
   public static void addPlayer(UUID uuid) {
     if (!players.contains(uuid)) players.add(uuid);
   }
   
   public static void removePlayer(ProxiedPlayer player) { removePlayer(player.getUniqueId()); }
   
   public static void removePlayer(UUID uuid) {
     if (players.contains(uuid)) players.remove(uuid);
   }
   
   public static boolean playerExists(ProxiedPlayer player) { return playerExists(player.getUniqueId()); }
   
   public static boolean playerExists(UUID uuid) {
     return players.contains(uuid);
   }
   
   public static void erasePlayers() { players = new LinkedList(); }
 }