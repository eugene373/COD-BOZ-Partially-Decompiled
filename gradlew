#!/bin/sh
##############################################################################
##  Gradle start up script for UN*X
##############################################################################

# Add default JVM options here
DEFAULT_JVM_OPTS=""

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD=maximum

warn () {
    echo "$*"
} >&2

die () {
    echo
    echo "$*"
    echo
    exit 1
} >&2

# OS specific support
cygwin=false
msys=false
darwin=false
nonstop=false
case "`uname`" in
  CYGWIN* )
    cygwin=true
    ;;
  Darwin* )
    darwin=true
    ;;
  MSYS* | MINGW* )
    msys=true
    ;;
  NonStop* )
    nonstop=true
    ;;
esac

# Resolve links: $0 may be a link
app_path=$0

# Need this for daisy-chained symlinks.
while
    APP_HOME=`dirname "$APP_HOME"` &&
    APP_HOME=`( cd "$APP_HOME" && pwd )`  &&
    [ -h "$app_path" ]
do
    ls=`ls -ld -- "$app_path"`
    link=`expr "$ls" : '.*-> \(.*\)$'`
    if expr "$link" : '/.*' > /dev/null; then
        app_path="$link"
    else
        app_path=`dirname "$app_path"`/"$link"
    fi
done

APP_HOME=`( cd "$(dirname "$0")" && pwd )`

# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        JAVACMD="$JAVA_HOME/jre/sh/java"
    else
        JAVACMD="$JAVA_HOME/bin/java"
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME"
    fi
else
    JAVACMD="java"
    which java >/dev/null 2>&1 || die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH."
fi

# For Cygwin or MSYS, switch paths to Windows format before running java
if $cygwin || $msys; then
    APP_HOME=`cygpath --path --mixed "$APP_HOME"`
    JAVACMD=`cygpath --unix "$JAVACMD"`
fi

# Collect all arguments for the java command
set -- \
    "-Dorg.gradle.appname=$APP_BASE_NAME" \
    -classpath "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" \
    org.gradle.wrapper.GradleWrapperMain \
    "$@"

exec "$JAVACMD" $DEFAULT_JVM_OPTS "$@"
