package com.springboot.music.service;

import java.util.List;

public interface IAmazonService {
	/* Amazon S3 Bucket Operations */
	void CreateBucket(String bucket_name);
	void ListingBucket();
	void DeleteBucket(String bucket_name);
	
	/* Amazon S3 Object Operations */
	/* Uploading object*/
	boolean UploadObjectS3(String bucket_name, String key, String filepath);
	void ListingObjectS3(String bucket_name);
	boolean DownloadObjectS3(String bucket_name, String obj_key, String path_save);
	boolean CopyObjectS3(String src_bucket_name, String src_key, String des_bicket_name, String des_key);
	boolean DeleteObjectS3(String bucket_name, String obj_key);
	boolean DeleteMutilObjectS3(String bucket_name, List<String> obj_keys);
}
