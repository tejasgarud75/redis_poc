# REDIS_POC

Spring boot project of redis poc . 

## Prerequisites

- JDK 8 or later
- Maven
- Docker
- MySQL Server

## Application Configuration

The application is configured using the following properties:

## Getting Started

### Step 1: Start Redis Server

Use Docker to quickly start a Redis server:

```bash
docker run --name redis -p 6379:6379 -d redis
```
This will pull the Redis image (if not already available) and run it on port 6379.

### Step 2: Configure Environment Variables

Set the following environment variables in your system or `.env` file:

- `REDIS_HOST`: Hostname of the Redis server (e.g., `localhost`)
- `REDIS_PORT`: Port of the Redis server (e.g., `6379`)
- `REDIS_PASSWORD`: Password for the Redis server (leave empty if no password)
- `REDIS_SSL`: Set to `true` if using SSL, otherwise `false`

### Step 3: Build and Run the Application

1: Clone the repository and navigate to the project directory:
   git clone https://github.com/tejasgarud75/redis_poc/
   
2: Set application.properties

3: Start the application

   The application will start on `http://localhost:8087`.

## Testing the Redis Integration

- Access the APIs provided by the application to observe caching behavior.
- Use Redis CLI or a GUI tool like RedisInsight to monitor cache entries.

## Cleanup

To stop and remove the Redis Docker container:

```bash
docker stop redis
docker rm redis
```

## Contributing

Feel free to open issues and submit pull requests for improvements.
