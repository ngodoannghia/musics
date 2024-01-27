package com.springboot.music.service;

import java.io.File;
import java.net.URL;
import java.util.List;

import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

public interface IAmazonService {
	/* Amazon S3 Bucket Operations */
	List<Bucket> ListingBucket();
	boolean CreateBucket(String bucketName);
	boolean DeleteBucket(String bucketName);
	
	/* Amazon S3 Object Operations */
	/* Uploading object*/
	public boolean UploadFileToRemote(String folder, String filename, File file);
	public boolean uploadFileToRemotePrivate(String fileName, File file);
	public boolean DeleteFileRemote(String filename);
	public boolean CopyFileRemote(String folder, String filename, String toFolder, String toFile);
	public URL GetResourceURL(String folder, String file);
	public URL GetResourceURL(String file);
	public S3ObjectInputStream GetMusic(String file, long start, long end);
	public S3ObjectInputStream GetMusic(String file);
	public boolean FileExist(String file);
	public long FileSize(String file);
	public boolean ChangeRole(String file);
}
