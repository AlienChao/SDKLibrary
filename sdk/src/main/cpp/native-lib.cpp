#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_sdk_MyStringUtil_getStringNDK(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++ Cc";
    return env->NewStringUTF(hello.c_str());
}
