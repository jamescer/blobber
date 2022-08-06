import axios from "axios";

const BLOBS_BASE_URL = 'http://localhost:8080/api/v1/jsonblob';

class BlobsService{

    getAllBlobs(){
        return axios.get(BLOBS_BASE_URL+'/all');
    }

}

export default new BlobsService();