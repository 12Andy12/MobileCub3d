LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := native-lib
LOCAL_SRC_FILES := native-lib.cpp
LOCAL_LDLIBS := -ldl -lGLESv1_CM -llog
include $(BUILD_SHARED_LIBRARY)