package aws

import grails.async.DelegateAsync
import grails.plugin.awssdk.s3.AmazonS3Service

class AsyncS3Service {

    @DelegateAsync AmazonS3Service amazonS3Service

}
