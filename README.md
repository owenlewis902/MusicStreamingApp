# Music Streaming App

Project to create music streaming app, which can stream from both Spotify, and a personal (on-prem) music library stored in a home server.
The application should have a web client which can be deployed to a website, and a client which can run natively on a BlackBerry Q20 device.
The application should provide an API so that any other clients can be added easily in the future, and should define how requests are routed to the on-prem library, or to Spotify.

## Project Milestones
### 1. Prototype
The prototype should provide the following components:
1. A bare-bones *MusicService* which defines a simple API
2. A mocked music library which contains only basic information on songs, but doesn't stream any audio
3. A sketch browser-based static web-client
#### Requirements
1. Sketch client interfaces with MusicService which in turn interfaces with MockMusicLibrary
2. Song info displayed on client
### 2. MVP - Spotify API Support & Sketch Client
#### Requirements
1. Add support for Spotify API to MusicService
2. Add playback support to sketch client
### 3. BlackBerry Client
#### Requirements
1. Build a BB10 OS native client to connect to MusicService API
### 4. On-prem Library Support
#### Requirements
1. Build a home web-server which serves audio files from a personal library
2. Add request routing between on-prem library, and spotify
### 5. Web client
#### Requirements
1. Add a proper web client
2. Deco sketch client
3. Deploy web client to personal domain
4. Should be authenticated so that only I can use it

## Non-Functional Requirements
* Secure
* Fun ? 
