import React, { Component } from 'react';
import BlobsService from '../services/BlobsService';

export default class Blobs extends Component {
  constructor(props) {
    super(props);

    this.state = {
      blobs: [],
    };
  }

  componentDidMount() {
    BlobsService.getAllBlobs().then((res) => {
      this.setState({ blobs: res.data });
    }).catch((err) => console.log(err));
  }

  render() {
    return (
      <div>
        <h2 className="text-center">Blobs!</h2>

        <div className="row">
          <table className="table">
            <thead>
              <tr>
                <th>Id</th>
                <th>Name</th>
              </tr>
            </thead>
            <tbody>
              {this.state.blobs.map((blob) => (
                <tr key={blob.id}>
                  <td>{blob.id}</td>
                  <td>{blob.name}</td>
                </tr>
              ))}

            </tbody>
          </table>
        </div>
      </div>
    );
  }
}
