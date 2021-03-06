package ru.spbau.mit.reptilian_detector.detector;

import org.bytedeco.javacv.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;

public interface IFilter {
    void applyEyeFilter(Mat face, Mat skinMask, TransformationFacePointsCollection points, Rect eye);
    void applyNoseFilter(Mat face, Mat skinMask, TransformationFacePointsCollection points, Rect nose);
    void applyMouthFilter(Mat face, Mat skinMask, TransformationFacePointsCollection points, Rect mouth);
    void applyFaceFilter(Mat face, Mat skinMask, TransformationFacePointsCollection points);
}
