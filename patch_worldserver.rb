# Turbolifts by Lesmothian
# Copyright (c) Joshua Lindsey <joshua.s.lindsey@gmail.com> 2013.
# All rights reserved.
#
# See LICENSE for details.
#
# Build files mostly copied from MineFactoryReloaded by powercrystals.
# https://github.com/powercrystals/MineFactoryReloaded

file = ARGV[0]
text = File.read file

text.gsub! /public WorldServer/, "public WorldServer(MinecraftServer minecraftServer, ISaveHandler saveHandler, String par2String, WorldProvider provider, WorldSettings par4WorldSettings, Profiler theProfiler, ILogAgent worldLogAgent)\n\t{\n\t\tsuper(saveHandler, par2String, provider, par4WorldSettings, theProfiler, worldLogAgent);\n\t\tthis.mcServer = minecraftServer;\n\t\tthis.theEntityTracker = null;\n\t\tthis.thePlayerManager = null;\n\t\tthis.field_85177_Q = null;\n\t}\n\n\tpublic WorldServer"

File.open(file, 'w') { |f| f.puts text }

puts "Patched #{file}"
