// src/org/myorg/CIUtils.groovy
package org.myorg

class CIUtils {
    static boolean imageExists(String imageName) {
        def result = sh(script: "docker images -q ${imageName}", returnStatus: true)
        return result == 0
    }
}
