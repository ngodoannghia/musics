package com.springboot.music.service;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.springboot.music.config.AWSClientConfig;

@RequiredArgsConstructor
@Service
public class AmazonService implements IAmazonService {
	private AmazonS3 amazonS3;
    private AWSClientConfig awsClientConfig;
	
	@Override
	public List<Bucket> ListingBucket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean CreateBucket(String bucketName) {
		// TODO Auto-generated method stub
		try {
			amazonS3.createBucket(bucketName);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean DeleteBucket(String bucketName) {
		// TODO Auto-generated method stub
		try {
			amazonS3.deleteBucket(bucketName);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean UploadFileToRemote(String folder, String filename, File file) {
		// TODO Auto-generated method stub
		try {
			amazonS3.putObject(new PutObjectRequest(awsClientConfig.getBucketName(), folder+ "/"+ filename, file)
	                .withCannedAcl(CannedAccessControlList.PublicRead));
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean uploadFileToRemotePrivate(String fileName, File file) {
		// TODO Auto-generated method stub
		try {
			amazonS3.putObject(new PutObjectRequest(awsClientConfig.getBucketName(), fileName, file)
	                .withCannedAcl(CannedAccessControlList.PublicRead));
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean DeleteFileRemote(String filename) {
		// TODO Auto-generated method stub
		try {
			amazonS3.deleteObject(awsClientConfig.getBucketName(), filename);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean CopyFileRemote(String folder, String filename, String toFolder, String toFile) {
		// TODO Auto-generated method stub
		try {
			amazonS3.copyObject(awsClientConfig.getBucketName(),filename,folder+"/"+filename,toFolder+"/"+toFile);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public URL GetResourceURL(String folder, String file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL GetResourceURL(String file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S3ObjectInputStream GetMusic(String file, long start, long end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public S3ObjectInputStream GetMusic(String file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean FileExist(String file) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long FileSize(String file) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ChangeRole(String file) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
