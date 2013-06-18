# Turbolifts by Lesmothian
# Copyright (c) Joshua Lindsey <joshua.s.lindsey@gmail.com> 2013.
# All rights reserved.
#
# See LICENSE for details.
#
# Build files mostly copied from MineFactoryReloaded by powercrystals.
# https://github.com/powercrystals/MineFactoryReloaded

require 'json'

java_file = ARGV[0]
mcmod_file = ARGV[1]
java_text = File.read java_file
mcmod_text = File.read mcmod_file
mcmod_parsed = JSON.load mcmod_text

result = java_text.scan /public static final String version = "(.*?)";/
version = result.flatten.first

mcmod_parsed.each { |mod| mod['version'] = version }

File.open(mcmod_file, 'w') { |f| f.puts JSON.pretty_generate(mcmod_parsed) }

puts version
