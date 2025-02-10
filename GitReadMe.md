<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Git Commands Guide</title>
    <style>
        body { font-family: Arial, sans-serif; line-height: 1.6; margin: 20px; }
        h1, h2, h3 { color: #333; }
        code { background: #f4f4f4; padding: 2px 5px; border-radius: 3px; }
        pre { background: #f4f4f4; padding: 10px; border-radius: 5px; overflow-x: auto; }
    </style>
</head>
<body>
    <h1>Git Commands Guide</h1>
    <p>This guide provides all the necessary steps for common Git operations such as push, pull, fetch, login, and authentication.</p>
    
    <h2>Prerequisites</h2>
    <ul>
        <li>Install Git: <a href="https://git-scm.com/downloads">Download Git</a></li>
        <li>Install GitHub CLI: <a href="https://cli.github.com/">Download GitHub CLI</a></li>
    </ul>
    
    <h2>GitHub Authentication</h2>
    <h3>Using GitHub CLI</h3>
    <p><code>gh auth login</code></p>
    <p>Follow the prompts to authenticate with your GitHub account.</p>
    
    <h2>Git Operations</h2>
    <h3>Initialize a New Git Repository</h3>
    <pre><code>git init</code></pre>
    
    <h3>Add and Commit Changes</h3>
    <pre><code>git add .</code></pre>
    <pre><code>git commit -m "Your commit message"</code></pre>
    
    <h3>Push Changes to Remote Repository</h3>
    <pre><code>git remote add origin https://github.com/your-username/your-repo-name.git</code></pre>
    <pre><code>git push -u origin master</code></pre>
    
    <h3>Pull Changes from Remote Repository</h3>
    <pre><code>git pull origin master</code></pre>
    
    <h3>Fetch Changes from Remote Repository</h3>
    <pre><code>git fetch origin</code></pre>
    
    <h3>Clone a Repository</h3>
    <pre><code>git clone https://github.com/your-username/your-repo-name.git</code></pre>
    
    <h3>Check Status</h3>
    <pre><code>git status</code></pre>
    
    <h3>View Commit History</h3>
    <pre><code>git log</code></pre>
    
    <h3>Create a New Branch</h3>
    <pre><code>git checkout -b new-branch-name</code></pre>
    <pre><code>git checkout branch-name</code></pre>
    
    <h3>Merge Branches</h3>
    <pre><code>git merge branch-name</code></pre>
    
    <h3>Delete a Branch</h3>
    <pre><code>git branch -d branch-name</code></pre>
    <pre><code>git push origin --delete branch-name</code></pre>
    
    <h2>Conclusion</h2>
    <p>This guide covers the basic Git operations you need to manage your repositories. For more advanced usage, refer to the official <a href="https://git-scm.com/doc">Git documentation</a>.</p>
</body>
</html>
