# Turbolifts by Lesmothian
# Copyright (c) Joshua Lindsey <joshua.s.lindsey@gmail.com> 2013.
# All rights reserved.
#
# See LICENSE for details.
#
# Build files mostly copied from MineFactoryReloaded by powercrystals.
# https://github.com/powercrystals/MineFactoryReloaded

require 'json'

puts JSON(File.read(ARGV[0])).first['version']
