package com.impact.gradle.detangler.plugin

class DetanglerPluginExtension {

    def basePackages
    def allowedInCycle = [ ]
    def includeTests = true
    def level = 2

}

